package swapan.dao;
import swapan.main.*;

import ravi.util.DBConnectionManager;
import java.sql.*;
import com.mysql.jdbc.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CreateDao1 {
	public void create(createmain m) throws SQLException{
        
        Connection con = (Connection) DBConnectionManager.getConnection();
        
        PreparedStatement ps=null;
        String query1 = "INSERT INTO marketplace(partner, baseUrl, uuid, openId, email) VALUES (?,?,?,?,?)";
        ps = (PreparedStatement) con.prepareStatement(query1);
        ps.setString(1, m.getMarketplace().getPartner());
        ps.setString(2, m.getMarketplace().getBaseUrl());
        ps.setString(3, m.getCreator().getUuid());
        ps.setString(4, m.getCreator().getOpenId());
        ps.setString(5, m.getCreator().getEmail());
        ps.executeUpdate();
        
       
        String query2= "INSERT INTO company(uuid,name,email,phoneno,website,country,m_uuid) VALUES (?,?,?,?,?,?,?) ";
        ps = (PreparedStatement) con.prepareStatement(query2);
        ps.setString(1, m.getPayload().getCompany().getUuid());
        ps.setString(2, m.getPayload().getCompany().getName());
        ps.setString(3, m.getPayload().getCompany().getEmail());
        ps.setString(4, m.getPayload().getCompany().getPhoneNumber());
        ps.setString(5, m.getPayload().getCompany().getWebsite());
        ps.setString(6, m.getPayload().getCompany().getCountry());
        ps.setString(7, m.getCreator().getUuid());
        ps.executeUpdate();
     
 }

}
