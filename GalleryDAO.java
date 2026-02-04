import java.sql.*;

public class GalleryDAO {

    public int addGallery(ArtGallery gallery) {

        String sql = "INSERT INTO gallery(name, location) VALUES (?, ?) RETURNING id";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, gallery.getGalleryName());
            ps.setString(2, gallery.getGalleryLocation());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1); // id gallery
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
