/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package PriorityQueues;

public class PriorityQueueDemo
{
    public static <AnyType extends Comparable<? super AnyType>> void dumpPQ( String msg, PriorityQueue<AnyType> pq )
    {
        System.out.println( msg + ":" );
        while(!pq.isEmpty( ))
            System.out.println( pq.remove( ) );
    }

    // Do some inserts and removes (done in dumpPQ).
    public static void main( String [ ] args )
    {
        PriorityQueue<Integer> minPQ = new PriorityQueue<Integer>( );
        
        minPQ.add( 4 );
        minPQ.add( 3 );
        minPQ.add( 5 );

        System.out.println( minPQ );
        dumpPQ( "minPQ", minPQ );
    }
}