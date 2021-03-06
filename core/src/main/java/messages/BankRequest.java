package messages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BankRequest implements Serializable {
    private String receiverId;
    private double charge;
    private String payeeID;
    private String recieversRef;

}
