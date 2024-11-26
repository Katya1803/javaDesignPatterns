package org.example.principles;


import org.example.core.Executable;

/**
 * Abstract class PrincipleGroup.
 * Purpose: Serves as a base class for all principle groups.
 */
public abstract class PrincipleGroup implements Executable {

    @Override
    public String getDescription() {
        return "Principle Group: " + this.getClass().getSimpleName();
    }
}
