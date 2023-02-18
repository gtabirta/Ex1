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

   public int collFiveArr [][] = new int [19][10];
   public int[][] getCollFiveArr() {
      return collFiveArr;
   }
   int colNum = 0;
   int rowNum = 0;
   public void appendCollFiveArr(int num) {
     // if (this.collFive == null)
     //    this.collFive = String.valueOf(num);
     // else
     //   this.collFive = collFive + " " + num;
         if (colNum != 9) {
            //System.out.println (num);
            //System.out.println (rowNum + " " + colNum);
            this.collFiveArr [rowNum][colNum] = num;
            colNum++;
            //System.out.print (this.collFiveArr[rowNum][colNum]);
         }
         else {
            //System.out.println (num);
            //System.out.println (rowNum + " " + colNum);
            this.collFiveArr [rowNum][colNum] = num;
            colNum = 0;
            rowNum++;
            //System.out.print (this.collFiveArr[rowNum][colNum]);
         }
         collFiveArr = this.collFiveArr;
      }
      //System.out.print (collFive1[0][0]);
   public String getCollFive() {
      {
         for (int row = 0; row < getCollFiveArr().length; row++) {
            for (int col = 0; col < getCollFiveArr()[row].length; col++) {
               int numArr;
               //System.out.println(row + " " + col);
               numArr = getCollFiveArr()[row][col];
               //System.out.println(numArr);
               appendCollFive(numArr);
               //System.out.println(collFive);

            }
         }
      }
      return this.collFive = collFive;
   }

   public String setCollFive() {
      this.collFive = collFive;
      return this.collFive;
   }
  int countFive = 1;
   public void appendCollFive(int numArr) {
         if (this.collFive == null) {
            this.collFive = String.valueOf(numArr);
            countFive++;
         }
         else if (this.collFive != null && countFive != 10 && countFive != 1) {
            this.collFive = collFive + " " + String.valueOf(numArr);
            countFive++;
         }
         else if (this.collFive != null && countFive == 10) {
            this.collFive = collFive + " " + String.valueOf(numArr) + "\n";
            countFive = 1;
         }
         else if (this.collFive != null && countFive == 1) {
            this.collFive = collFive + String.valueOf(numArr);
            countFive++;
         }
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
               appendCollFiveArr(num);
            if (num % 6 == 0)
               appendCollSix(num);
         }
      }
   }


