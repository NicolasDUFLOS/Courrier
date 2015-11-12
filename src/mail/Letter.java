/**
 * 
 */
package mail;

import city.Inhabitant;
import content.Content;

/**
 * @author DUFLOS Nicolas
 * @author DELASSUS Alexandre
 *
 */
public abstract class Letter <C extends Content> {

	protected int cost;
	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected C content;
	
	public Letter(){
		
	}
	
	public int getCost(){
		return this.cost;
	}
	
	public Inhabitant getSender(){
		return this.sender;
	}
	
	public Inhabitant getReceiver(){
		return this.receiver;
	}
	
	public C getContent(){
		return this.content;
	}
	
	public void description(){
		System.out.println("A letter whose content is " + this.getContent());
	}
	
	protected abstract void doAction();
}