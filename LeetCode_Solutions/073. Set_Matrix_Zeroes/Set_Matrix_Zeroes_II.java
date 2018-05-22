public void setZeroes(int[][] matrix) {
       if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
           return;
       }
       int col0 = 1, rows = matrix.length, cols = matrix[0].length;
       for (int i = 0; i < rows; ++i) {
           if (matrix[i][0] == 0) {
               col0 = 0;
           }
           for (int j = 1; j < cols; ++j) {
               if (matrix[i][j] == 0) {
                   matrix[i][0] = 0;
                   matrix[0][j] = 0;
               }
           }
       }
       for (int i = rows - 1; i >= 0; --i) {
           for (int j = cols - 1; j >= 1; --j) {
               if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                   matrix[i][j] = 0;
               }
           }
           if (col0 == 0) {
               matrix[i][0] = 0;
           }
       }
   }

   /*
   http://www.pythontutor.com/visualize.html#code=public%20class%20YourClassNameHere%20%7B%0A%20%20%20public%20static%20int%5B%5D%5B%5D%20setZeroes%28int%5B%5D%5B%5D%20matrix%29%20%7B%0A%20%20%20%20%20%20%20%20if%20%28matrix%20%3D%3D%20null%20%7C%7C%20matrix.length%20%3D%3D%200%20%7C%7C%20matrix%5B0%5D.length%20%3D%3D%200%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20return%20matrix%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20int%20col0%20%3D%201,%20rows%20%3D%20matrix.length,%20cols%20%3D%20matrix%5B0%5D.length%3B%0A%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%200%3B%20i%20%3C%20rows%3B%20%2B%2Bi%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%20%28matrix%5Bi%5D%5B0%5D%20%3D%3D%200%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20col0%20%3D%200%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20for%20%28int%20j%20%3D%201%3B%20j%20%3C%20cols%3B%20%2B%2Bj%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20if%20%28matrix%5Bi%5D%5Bj%5D%20%3D%3D%200%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20matrix%5Bi%5D%5B0%5D%20%3D%200%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20matrix%5B0%5D%5Bj%5D%20%3D%200%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%20rows%20-%201%3B%20i%20%3E%3D%200%3B%20--i%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20for%20%28int%20j%20%3D%20cols%20-%201%3B%20j%20%3E%3D%201%3B%20--j%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20if%20%28matrix%5Bi%5D%5B0%5D%20%3D%3D%200%20%7C%7C%20matrix%5B0%5D%5Bj%5D%20%3D%3D%200%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20matrix%5Bi%5D%5Bj%5D%20%3D%200%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20if%20%28col0%20%3D%3D%200%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20matrix%5Bi%5D%5B0%5D%20%3D%200%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20return%20matrix%3B%0A%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20int%5B%5D%5B%5D%20matrix%20%3D%20%7B%7B1,1,1%7D,%7B1,0,1%7D,%7B1,1,1%7D%7D%3B%0A%20%20%20%20%20%20%20%20System.out.println%28setZeroes%28matrix%29%29%3B%0A%20%20%20%20%7D%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
   */
