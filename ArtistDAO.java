import java.sql.*;

    public class ArtistDAO {

        public int addArtist(Artist artist) {
            String sql = "INSERT INTO artist(name, birth_year, nationality) VALUES (?, ?, ?) RETURNING id";

            try (Connection conn = DBConnection.getConnection();
                 PreparedStatement ps = conn.prepareStatement(sql)) {

                ps.setString(1, artist.getName());
                ps.setInt(2, artist.getBirthYear());
                ps.setString(3, artist.getNationality());

                ResultSet rs = ps.executeQuery();
                if (rs.next()) return rs.getInt(1);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }
    }

