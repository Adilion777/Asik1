import java.sql.*;
import java.util.ArrayList;

public class ArtworkDAO {

    public void addArtwork(Artwork artwork, int artistId) {
        String sql = "INSERT INTO artwork(title, year_created, price, artist_id) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, artwork.getTitle());
            ps.setInt(2, artwork.getYearCreated());
            ps.setDouble(3, artwork.getPrice());
            ps.setInt(4, artistId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getAllArtworks() {
        ArrayList<String> list = new ArrayList<>();
        String sql = "SELECT title, price FROM artwork";

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(rs.getString("title") + " - $" + rs.getDouble("price"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void updatePrice(String title, double newPrice) {
        String sql = "UPDATE artwork SET price=? WHERE title=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDouble(1, newPrice);
            ps.setString(2, title);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteArtwork(String title) {
        String sql = "DELETE FROM artwork WHERE title=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, title);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
