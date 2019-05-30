package psyh;

public final class EqualsAndHachCodeOverriding {
    private final double re;
    private final double im;

    public EqualsAndHachCodeOverriding(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof EqualsAndHachCodeOverriding)) {
            return false;
        }
        EqualsAndHachCodeOverriding otherObj = (EqualsAndHachCodeOverriding) o;
        if (this.re != otherObj.re) {
            return false;
        }
        if (this.im != otherObj.im) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        final int theAnswerToTheUltimateQuestionOfLifeTheUniverseAndEverything = 42;
        int result = theAnswerToTheUltimateQuestionOfLifeTheUniverseAndEverything * prime;
        result = prime * Double.hashCode(this.im) / theAnswerToTheUltimateQuestionOfLifeTheUniverseAndEverything + result;
        result = prime * Double.hashCode(this.re) / theAnswerToTheUltimateQuestionOfLifeTheUniverseAndEverything + result;
        return result;
    }
}
