package nicebank;
import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;

public class Money {
   private double amount; 
   public Money() {
       this.amount = 0.0;
   }
   public Money(int dollars, int cents){
       String input = "" + dollars + "." + cents;
       System.out.println("This is constructor");
       this.amount = Double.parseDouble(input);
   }

   public Money(double amount) {
       this.amount = amount;
   }

   public Money add(Money input){
   	return new Money(input.getAmount() + this.getAmount());
   }

   public double getAmount(){
       return this.amount;   
   }

  @Override
  public boolean equals(Object other) {
    return reflectionEquals(this, other);
  }

  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }
}
