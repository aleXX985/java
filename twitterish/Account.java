import java.util.Set;
import java.util.TreeSet;
import java.io.Serializable;

public class Account implements Serializable, Comparable<Account> {
    private int postsAtLastSync;
    private String name;
    private String password;
    private String userId;
    private boolean passwordReset;
    private Set<Account> friends = new TreeSet<Account>();
    private Set<Account> ignoredFriends = new TreeSet<Account>();


    public Account(String userId, String password) {
        this.userId   = userId;
        this.password = password;
    }

    public Account(String userId, String password, String name) {
        this(userId, password);
        this.name = name;
    }

    public Account safeCopy() {
        Account safe = new Account(userId, "", name);
        safe.postsAtLastSync = this.postsAtLastSync;
        safe.friends = this.friends;
        safe.ignoredFriends = this.ignoredFriends;
        return safe;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserId() {
        return this.userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void addFriend(Account a) {
        this.friends.add(a);
    }

    public void removeFriend(Account a) {
        this.friends.remove(a);
    }

    public void ignoreFriend(Account a) {
        if (this.isFriendsWith(a)) this.ignoredFriends.add(a);
    }

    public void unIgnoreFriend(Account a) {
        if (this.isFriendsWith(a)) this.ignoredFriends.remove(a);
    }

    public boolean isFriendsWith(Account a) {
        return this.friends.contains(a);
    }

    public boolean isCurrentlyIgnoring(Account a) {
        return this.ignoredFriends.contains(a);
    }

    public int compareTo(Account a) {
        return a.userId.compareTo(this.userId);
    }

    public boolean hasFriends() {
        return this.friends.size() > 0;
    }

    public boolean hasIgnoredFriends() {
        return this.ignoredFriends.size() > 0;
    }

    public Account[] getFriends() {
        return (Account[]) this.friends.toArray(new Account[0]);
    }

    public Account[] getIgnoredFriends() {
        return (Account[]) this.ignoredFriends.toArray(new Account[0]);
    }

    public int getPostAtLastSync() {
        return this.postsAtLastSync;
    }

    public void setPostAtLastSync(int posts) {
        this.postsAtLastSync = posts;
    }

    public boolean equals(Object o) {
        if (o instanceof Account) {
            return ((Account) o).userId.equals(this.userId);
        } else {
            return false;
        }
    }
}
