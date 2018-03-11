package blockChain;

import java.util.ArrayList;



public class Main {
	ArrayList<Block> blockchain = new ArrayList<>();
  public static void main(String[] args) {
	  String[] genesisTransactions = {"5000 bit coins","sent success"};
	  Block genesisBlock = new Block(0,genesisTransactions);
	  System.out.println("Block 1 : "+ genesisBlock.getBlockhash());
	  
	  String[] block2transaction = {"9000 bit coins","sent success"};
	  Block Block2 = new Block(genesisBlock.getBlockhash(),block2transaction);
	  System.out.println("Block 2 : "+ Block2.getBlockhash());
	  
	  String[] block3transaction = {"1000 bit coins","sent failed"};
	  Block Block3 = new Block(Block2.getBlockhash(),block3transaction);
	  System.out.println("Block 3 : "+ Block3.getBlockhash());
	  
  }
}
