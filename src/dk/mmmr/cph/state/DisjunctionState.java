package dk.mmmr.cph.state;

public class DisjunctionState implements State {
    private State left;
    private State right;

    public DisjunctionState(State left, State right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean subStateOf(State other) {
        if (other instanceof MappedState) {
            var mapped = (MappedState) other;
            if(mapped.subStateOf(left))
            {
                return true;
            }
            if(mapped.subStateOf(right))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public ValueSet valuesOf(String variableName) {
        MappedState leftMapped = (MappedState) left;
        MappedState rightMapped = (MappedState) right;

        if(leftMapped.valuesOf(variableName) != null)
        {
            return leftMapped.valuesOf(variableName);
        }
        return rightMapped.valuesOf(variableName);
    }
}
