import actor.OrderActor;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import messages.Init;

public class OrderApplication {

    public static void main(String[] args){
        ActorSystem system = ActorSystem.create();
        ActorRef ref = system.actorOf(Props.create(OrderActor.class), "Orders");
        ref.tell(new Init(), null);
    }

}
