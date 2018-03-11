package blockChain;

import java.util.Arrays;


public class Block {
   private int previoushash;
   private String[] transaction;
   private int blockhash;
   public int getPrevioushash() {
	return previoushash;
}

public String[] getTransaction() {
	return transaction;
}

public int getBlockhash() {
	return blockhash;
}

public Block(int previoushash,String[] transaction) {
	   this.previoushash = previoushash;
	   this.transaction = transaction;
	   Object[] contents = {Arrays.hashCode(transaction), previoushash};
	   this.blockhash = Arrays.hashCode(contents);
   }
}
