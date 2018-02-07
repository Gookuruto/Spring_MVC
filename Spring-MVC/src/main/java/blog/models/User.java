package blog.models;
import java.util.HashSet;
import java.util.Set;

public class User {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswaordHash() {
        return passwaordHash;
    }

    public void setPasswaordHash(String passwaordHash) {
        this.passwaordHash = passwaordHash;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Set<Post> getPosts() {
        return posts;
    }

    public void setPosts(Set<Post> posts) {
        this.posts = posts;
    }
    public User(Long id,String username,String fullName){
        this.id=id;this.username=username;this.fullName=fullName;
    }
    @Override
    public String toString(){
        return "User{"+"id="+id+",username="+username+'\'' +"passwordHash="+passwaordHash+'\''+",fullName"+fullName+'\''+'}';

    }

    private Long id;
    private  String username;
    private String passwaordHash;
    private String fullName;
    private Set<Post> posts = new HashSet<>();

}
