package withHibernate.EntityH;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "CustomerH")
public class Customer extends User {
    private String address;

    public Customer(String username, String password, String address) {
        super(username, password);
        this.address = address;
    }


    public String toString() {
        return "Customer{" +
                "address='" + address + '\'' +
                "username='" + getUsername() + '\'' +
                "password='" + getPassword() + '\'' +
                "id='" + getId() + '\'' +
                '}';
    }
}
