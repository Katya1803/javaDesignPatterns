package org.example.patterns;


import org.example.core.Executable;

/**
 * Abstract class PatternGroup.
 * Purpose: Serves as a base class for all pattern groups.
 */
public abstract class PatternGroup implements Executable {

    @Override
    public String getDescription() {
        return "Pattern Group: " + this.getClass().getSimpleName();
    }
}
