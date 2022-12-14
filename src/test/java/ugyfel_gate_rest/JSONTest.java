package ugyfel_gate_rest;

import com.project.ugyfel_gate_rest.Classes.Location;
import com.project.ugyfel_gate_rest.Classes.Organisation;
import com.project.ugyfel_gate_rest.Classes.User;
import com.project.ugyfel_gate_rest.DataBase.GetArray;
import com.project.ugyfel_gate_rest.DataBase.GetJSON;
import com.project.ugyfel_gate_rest.Classes.MD5;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JSONTest
{
    User user = GetArray.getDataFromUserTable().get(2);
    User user1 = GetArray.getDataFromUserTable().get(1);
    User user2 = GetArray.getDataFromUserTable().get(0);
    Organisation organisation = GetArray.getDataFromOrganisationsTable().get(0);
    Location location = GetArray.getDataFromLocationsTable().get(0);
    @Test
    public void UserJSONTest() throws NoSuchAlgorithmException
    {
        GetJSON.getJSONDataUserName("JaniHegedus", MD5.Translate_to_MD5_HASH("Jancsika20"));
    }
    @Test
    public void LocationJSONTest()
    {
        GetJSON.getJSONDLocation(location);
    }
    @Test
    public void OrganisationJSONTest()
    {
        GetJSON.getJSONORG(organisation);
    }
    @Test
    public void LocationCardJSONTest()
    {
        GetJSON.getJSONLocationCard(user);
        GetJSON.getJSONLocationCard(user1);
        GetJSON.getJSONLocationCard(user2);
    }
    @Test
    public void IdCardJSONTest()
    {
        GetJSON.getJSONIDCard(user);
    }
    @Test
    public void DriversLicenseJSONTest()
    {
        GetJSON.getJSONDriversLicense(user);
    }
    @Test
    public void UsersJSONTest() {
        assertEquals(3,GetJSON.getJSONUsers().length());
    }
}
