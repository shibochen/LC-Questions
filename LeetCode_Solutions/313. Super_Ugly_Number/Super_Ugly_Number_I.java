class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] uglys = new int[n];
        int[] idx = new int[primes.length];

        uglys[0] = 1;

        for (int i = 1; i < n; i++) {
            uglys[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                uglys[i] = Math.min(uglys[i], primes[j] * uglys[idx[j]]);
            }

            for (int j = 0; j < primes.length; j++) {
                while (primes[j] * uglys[idx[j]] <= uglys[i]) idx[j]++;
            }
        }
        return uglys[n - 1];
    }
}

/*
http://www.pythontutor.com/visualize.html#code=%0Apublic%20class%20Ugly%20%7B%0A%20%20%20%20public%20static%20int%20nthSuperUglyNumber%28int%20n,%20int%5B%5D%20primes%29%20%7B%0A%20%20%20%20%20%20%20%20int%5B%5D%20uglys%20%3D%20new%20int%5Bn%5D%3B%0A%20%20%20%20%20%20%20%20int%5B%5D%20idx%20%3D%20new%20int%5Bprimes.length%5D%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20uglys%5B0%5D%20%3D%201%3B%0A%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%201%3B%20i%20%3C%20n%3B%20i%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20uglys%5Bi%5D%20%3D%20Integer.MAX_VALUE%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20for%20%28int%20j%20%3D%200%3B%20j%20%3C%20primes.length%3B%20j%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20uglys%5Bi%5D%20%3D%20Math.min%28uglys%5Bi%5D,%20primes%5Bj%5D%20*%20uglys%5Bidx%5Bj%5D%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20%0A%20%20%20%20%20%20%20%20%20%20%20%20for%20%28int%20j%20%3D%200%3B%20j%20%3C%20primes.length%3B%20j%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20while%20%28primes%5Bj%5D%20*%20uglys%5Bidx%5Bj%5D%5D%20%3C%3D%20uglys%5Bi%5D%29%20idx%5Bj%5D%2B%2B%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20return%20uglys%5Bn%20-%201%5D%3B%0A%20%20%20%20%7D%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20//%20TODO%20Auto-generated%20method%20stub%0A%20%20%20%20%20%20%20%20int%20n%20%3D%204%3B%0A%20%20%20%20%20%20%20%20int%5B%5D%20primes%20%3D%20%7B2,7,13,19%7D%3B%0A%20%20%20%20%20%20%20%20System.out.println%28nthSuperUglyNumber%28n,%20primes%29%29%3B%0A%20%20%20%20%7D%0A%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
*/
