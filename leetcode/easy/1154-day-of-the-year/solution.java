class Solution {
    // public int dayOfYear(String date) {
    //     int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    //     int[] arr = new int[3];
    //     boolean leap = false;
    //     int i = 0;
    //     int k = 0;
    //     while(i<date.length()){
    //         int temp = 0;
    //         while(i < date.length() && date.charAt(i) != '-'){
    //             temp = temp*10 + (date.charAt(i) - '0');
    //             i++;
    //         }
    //         arr[k++] = temp;
    //         i++;
    //     }
    //     if((arr[0]%400 == 0) || (arr[0] %4 == 0 && arr[0] %100 != 0)) leap = true;
    //     int ans = 0;
    //     for(int x = 1;x<arr[1];x++){
    //         if(x == 2 && leap) {
    //             ans += 29;
    //             continue;
    //         }
    //         ans += days[x];
    //     }
    //     return ans + arr[2];
    // }
    public int dayOfYear(String date) {
        int[] days = {0,31,59,90,120,151,181,212,243,273,304,334,365};
        int[] arr = new int[3];
        boolean leap = false;
        int i = 0;
        int k = 0;
        while(i<date.length()){
            int temp = 0;
            while(i < date.length() && date.charAt(i) != '-'){
                temp = temp*10 + (date.charAt(i) - '0');
                i++;
            }
            arr[k++] = temp;
            i++;
        }
        if((arr[0]%400 == 0) || (arr[0] %4 == 0 && arr[0] %100 != 0)) leap = true;
        return leap && (arr[1]-1 >=2) ? days[arr[1]-1] + arr[2] + 1: days[arr[1]-1] + arr[2];
    }
}