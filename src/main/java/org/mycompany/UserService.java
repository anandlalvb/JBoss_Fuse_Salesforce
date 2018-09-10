package org.mycompany;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import org.apache.camel.Exchange;
import org.mycompany.model.UserPojo;


public class UserService {
	public void livesWhere(Exchange exchange) {
		exchange.getIn().setBody("Here is a new message body!");
	}
	
    // use a tree map so they become sorted
    private final Map<String, UserPojo> users = new TreeMap<String, UserPojo>();

    public UserService() {
        users.put("123", new UserPojo(123, "John","Doe"));
        users.put("456", new UserPojo(456, "Donald","Duck"));
        users.put("789", new UserPojo(789, "Slow","Turtle"));
    }
    
    /**
     * Updates or creates the given user
     *
     * @param user the user
     */
    public void updateUser(UserPojo user) {
        users.put("" + user.getId(), user);
    }
    
    /**
     * List all users
     *
     * @return the list of all users
     */
    public Collection<UserPojo> listUsers() {
        return users.values();
    }

}
