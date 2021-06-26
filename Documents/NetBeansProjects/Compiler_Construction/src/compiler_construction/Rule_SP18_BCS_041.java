package compiler_construction;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Zaryab | SP18-BCS-041
 */

public class Rule_SP18_BCS_041 {

    protected String leftSide;
    protected String[] rightSide;

    public Rule_SP18_BCS_041(String leftSide, String[] rightSide) {
        this.rightSide = rightSide;
        this.leftSide = leftSide;
    }

    public Rule_SP18_BCS_041(Rule_SP18_BCS_041 rule) {
        this.leftSide = rule.getLeftSide();
        this.rightSide = rule.rightSide.clone();
    }
    
    public String getLeftSide() {
        return leftSide;
    }

    public String[] getRightSide() {
        return rightSide;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.leftSide);
        hash = 29 * hash + Arrays.deepHashCode(this.rightSide);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rule_SP18_BCS_041 other = (Rule_SP18_BCS_041) obj;
        if (!Objects.equals(this.leftSide, other.leftSide)) {
            return false;
        }
        if (!Arrays.deepEquals(this.rightSide, other.rightSide)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String str = leftSide + " -> ";
        for (int i = 0; i < rightSide.length; i++) {
            str += rightSide[i] + " ";
        }
        return str;
    }

}
