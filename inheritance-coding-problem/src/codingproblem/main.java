/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codingproblem;

/**
 *
 * @author Alondra Bio
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //A. BUILD SUCCESS
        /*
         * OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
         * Cache cache = (Cache) optimizedDiskCache;
         */

        //B.ClassCastException - cannot be cast to DiskCache
        /*
         * MemoryCache memoryCache = new MemoryCache();
         * Cache cache = (Cache) memoryCache;
         * DiskCache diskCache = (DiskCache) cache;
         */
        
        //C.ClassCastException - cannot be cast to OptimizedDiskCache
        /*
         * DiskCache diskCache = new DiskCache();
         * OptimizedDiskCache optimizedDiskCache = (OptimizedDiskCache) diskCache;
         */
        
        //D. BUILD SUCCESS
        /*
         * OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
         * DiskCache diskCache = (DiskCache) optimizedDiskCache;
         */
        
        //E. ClassCastException - cannot be cast to MemoryCache
        /*
         * Cache cache = new Cache();
         * MemoryCache memoryCache = (MemoryCache) cache;
         */
        
        //F. BUILD SUCCESS
        /*
         * OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
         * Cache cache = (Cache) optimizedDiskCache;
         * DiskCache diskCache = (DiskCache) cache;
         */
    }

}
