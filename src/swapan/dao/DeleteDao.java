package swapan.dao;

import swapan.main.createmain;

import swapan.main.Creator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ravi.util.DBConnectionManager;

public class DeleteDao {
	public void delete(createmain m)
		    throws SQLException
		  {
		    Connection con = DBConnectionManager.getConnection();
		    PreparedStatement ps = null;
		    String query = "delete from company where m_uuid = ?";
		    ps = con.prepareStatement(query);
		    ps.setString(1, m.getCreator().getUuid());
		  }


}
