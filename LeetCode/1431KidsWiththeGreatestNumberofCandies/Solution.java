class Solution {
    public int FindMax(int[] arr){
        int n=arr.length;
        int max=arr[0];

        for(int i=1; i<n;i++){
            if(arr[i]>max) max= arr[i];
        }

        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     //size of candies array
     int n=candies.length;
     List<Boolean> li = new ArrayList<>();

    //find gratest no of candies
     int gratestCandies= FindMax(candies);


     for(int i=0;i<n;i++){
        //current candies + ExtraCandies
        int totalcandies=candies[i]+extraCandies;

        //After giving ExtraCandies if kid will have greatest no of candies than add true
        if(totalcandies>= gratestCandies) li.add(true);

        // if not than add false
        else li.add(false);
     }

     return li;
    }
}