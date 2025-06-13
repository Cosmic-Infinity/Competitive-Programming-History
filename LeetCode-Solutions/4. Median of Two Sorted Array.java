//2ms 44.5mb



class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        short m = (short)nums1.length;
        short n = (short)nums2.length;

        int c[] = new int[m+n];

        short p1 = 0;
        short p2 = 0;

        for(short i = 0; i<(m+n); i++){
            if(p1<m && p2<n){
                if(nums1[p1] < nums2[p2]){
                    c[i] = nums1[p1];
                    p1++;
                }
                else{
                    c[i] = nums2[p2];
                    p2++;
                }
            }
            else if(p1<m){
                c[i] = nums1[p1];
                p1++;
            }
            else if(p2<n){
                c[i] = nums2[p2];
                p2++;
            }
        }

        if((m+n)%2 == 0){
            return((c[((m+n)/2)-1] + c[(m+n)/2])/2.0);
        }
        else{
            return(c[((m+n)/2)]);
        }

    }
}