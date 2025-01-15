/**********************PROBLEM-1*************/
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/**********************PROBLEM-2*************/
// Time Complexity : 0(m+n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode :yes

// Take two pointers from the end of two arrays and third pointer as position
    //Iterating over the array include the elements in descending order exhaust the
    //second pointer if not zero
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length == 0 || nums1 == null) {
            return;
        }
        int ptr1 = m - 1, ptr2 = n - 1, pos = m + n - 1;
        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] >= nums2[ptr2]) {
                nums1[pos--] = nums1[ptr1--];
            } else {
                nums1[pos--] = nums2[ptr2--];
            }
        }
        while (ptr2 >= 0) {
            nums1[pos--] = nums2[ptr2--];
        }

    }
}

/**********************PROBLEM-3*************/
// Time Complexity : 0(m+n) m=rows,n=cols
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes


// Search the matrix by fixing a pivot which is incrementing in one direction
    // and decrementing in other untill we find the element or run out of loop
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length-1,m=matrix.length-1;
        int row=0,col=n;
        while(row<=m && col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return false;
    }
}