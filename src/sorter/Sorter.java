package sorter;

public class Sorter {
   private int num;

   private boolean inRange;

   public int getNum() {
      return num;
   }

   public void setNum(int num) {
      this.num = num;
   }

   public void increment(int times) {
      if (times > 0) {
         for (int i = 0; i < times; i++){
            distribute(num);
            num++;
         }
      }
   }

   private int minNum;

   public int getMinNum() {
      return this.minNum;
   }

   public void setMinNum(int minNum) {
      this.minNum = minNum;
   }

   private int maxNum;

   public int getMaxNum() {
      return this.maxNum;
   }

   public void setMaxNum(int maxNum) {
      this.maxNum = maxNum;
   }

   private String collFive;

   public void appendCollFive(int num) {
      if (this.collFive == null)
         this.collFive = String.valueOf(num);
      else
         this.collFive = collFive + " " + num;
   }

   public String getCollFive() {
      return collFive;
   }

   public void setCollFive(String collFive) {
      this.collFive = collFive;
   }

   private String collSix;

   public String getCollSix() {
      return collSix;
   }

   public void setCollSix(String collSix) {
      this.collSix = collSix;
   }
   int countSix = 1;
   public void appendCollSix(int num) {
      if (this.collSix == null){
      this.collSix = String.valueOf(num);
         countSix++;
      }
      if (this.collSix != null && countSix != 10 && countSix != 1 ) {
         this.collSix = collSix + " " + num;
         countSix++;
      }
      if (this.collSix != null && countSix == 10) {
         this.collSix = collSix + " " + num + "\n";
         countSix = 1;
      }

      if (this.collSix != null && countSix == 1) {
         this.collSix = collSix + num;
         countSix++;
      }
   }
      public void distribute (int num){
         if (num > getMinNum() && num < getMaxNum()) {
            if (num % 5 == 0)
               appendCollFive(num);
            if (num % 6 == 0)
               appendCollSix(num);
         }
      }
   }


