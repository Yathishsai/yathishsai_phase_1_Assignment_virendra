package com.flightbooking.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class ConnectionUtil {
public Connection con=null;
public Statement st=null;
public ConnectionUtil() throws ClassNotFoundException, SQLException{
Class.forName("com.mysql.cj.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flyaway","root"
,"9866");
System.out.println("connection established with database");
st=con.createStatement();
}
public List<String[]> getAvailableFlights(String f, String t, String d, String query) {
List<String[]> flights=new ArrayList<>();

try {
ResultSet rs=st.executeQuery(query);
if(rs.next()) {
String[] flight=new String[3];
flight[0]=rs.getString("name");
flight[1]=rs.getString("timef");
flight[2]=rs.getString("price");
flights.add(flight);
return flights;
}
} catch (SQLException e) {
e.printStackTrace();
}
return null;
}
public HashMap<String, String> checkUser(String email, String password, String query) {
HashMap<String,String> user=null;

try {
ResultSet rs=st.executeQuery(query);
if(rs.next()) {
user=new HashMap<>();
user.put("name", rs.getString("name"));
user.put("email",rs.getString("email"));
user.put("phno",rs.getString("phno"));
user.put("adno",rs.getString("adno"));
}
return user;
} catch (SQLException e) {
e.printStackTrace();
}
return user;
}
public boolean insertUser(HashMap<String, String> user, String query) {

try {
st.execute(query);
return true;
} catch (SQLException e) {
e.printStackTrace();
}
return false;
}
public boolean checkAdmin(String email, String password, ResultSet rs) {
try {


if(rs.next())
return true;
} catch (SQLException e) {
e.printStackTrace();
}
return false;
}
public boolean changeAdminPassword(String email, String password, ResultSet rs) {
try {

if(!rs.next()) {
return false;
}

return true;
} catch (SQLException e) {
e.printStackTrace();
}
return false;
}
public boolean insertFlight(HashMap<String, String> flight, String query1) throws SQLException {
//PreparedStatement stm=con.prepareStatement("INSERT INTO 'flyaway.flights' 
//('name', 'from', 'to', 'date', 'time', 'price') values(?,?,?,?,?,?)");
//String sql="INSERT INTO flights ('name','from','to','date','time','price') 
//values('"+flight.get("name")+"','"+flight.get("from")+"','"+flight.get("to")+"','"
//+flight.get("date")+"','"+flight.get("time")+"','"+flight.get("price")+"');";
//String query1 = "INSERT INTO flights (name, fromf, tof, datef, timef, price) "
//VALUES" + " ('"
//+ StringUtil.fixSqlFieldValue(flight.get("name")) + "'," + " '"
//+ StringUtil.fixSqlFieldValue(flight.get("from")) + "'," + " '"

//String sql="INSERT INTO `flyaway`.`flights` (`name`, `fromf`, `tof`, 
//`datef`, `timef`, `price`) VALUES ('indigo', 'hyd', 'viz', '2021-04-08', '10:00', 
//'2000');";
System.out.println(flight.get("date"));
System.out.println(flight.get("time"));
//String query1="INSERT into flyaway.flights (name,from,to,date,time,price) 
//values('indigo','hyd','viz','24-02-2022','10:30','2000')";
try {
//stm.execute();
st.execute(query1);
return true;
} catch (SQLException e) {
System.out.print("error");
e.printStackTrace();
}
return false;
}
}
