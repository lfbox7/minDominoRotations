class Main {


  public static int minDominoRotations(int [] A, int [] B) {
        // hold length of array
        int len = A.length;
        
        // three pointers from 0 until length of A and when A[i] or B[i] == 0
        for (int i = 0, j = 0, k = 0; i < len && (A[i] == A[0] || B[i] == A[0]); i++) {
            // second pointer moves if A[i] == A[0]
            if (A[i] == A[0]) 
                j++;
            // thrid pointer moves if B[i] == A[0] 
            if (B[i] == A[0]) 
                k++;
            // stop and return max len if i == length of A - 1
            if (i == len-1) 
                return Math.min(len-j, len-k);
        }
        // three pointers from 0 until length of A and when A[i] or B[i] == 0 once again
        for (int i = 0, j = 0, k = 0; i < len && (A[i] == B[0] || B[i] == B[0]); i++) {
            // second pointer moves if A[i] == A[0]
            if (A[i] == B[0]) 
                j++;
            // thrid pointer moves if B[i] == A[0] 
            if (B[i] == B[0]) 
                k++;
            // stop and return max len if i == length of A - 1
            if (i == len-1) 
                return Math.min(len-j, len-k);           
        }
        // return -1 if cannot match dominos
        return -1;
    }

  public static void main(String[] args) {
    int [] A = {1,2,1,1,1,2,2,2};
    int [] B = {2,1,2,2,2,2,2,2};
    System.out.println(minDominoRotations(A, B));
  }
}