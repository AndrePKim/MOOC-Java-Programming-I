/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kim
 */
public class Timer {
    private ClockHand second;
    private ClockHand hsecond;
    
    public Timer() {
        this.second = new ClockHand(60);
        this.hsecond = new ClockHand(100);
    }
    
    public void advance() {
        this.hsecond.advance();
        
        if (this.hsecond.value()==0) {
            this.second.advance();
        }
    }
    
    public String toString() {
        return this.second + ":" + this.hsecond;
    }
    
}
