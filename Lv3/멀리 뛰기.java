class Solution {
      public long solution(int n) {
          long answer = 0;

              if(n>=1 && n<=2000){
                  long[] arr=new long[n+1];
                  arr[0]=1;
                  arr[1]=2;
                  for(int i=2; i<n; i++) {
                      arr[i]=(arr[i-2]+arr[i-1])%1234567;
                  }
                  answer=arr[n-1];
              }


          return answer;
      }
}