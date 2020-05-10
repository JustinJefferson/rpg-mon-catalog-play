package models;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ElementEffectiveness extends Model {

    public enum Rating {
        EFFECTIVE(2.0),
        NEUTRAL(1.0),
        INEFFECTIVE(0.5),
        IMMUNE(0.0);

        private final double score;

        Rating(double score) {
            this.score = score;
        }

        public double getScore() {
            return this.score;
        }

        public static Rating getType(Double score) {
            if(score == null) return null;

            for(Rating rating: Rating.values()) {
                if(score.equals(rating.score)) return rating;
            }

            return null;
        }

        public static Boolean valid(Double score) {
            return getType(score) != null;
        }
    }

    @ManyToOne(optional = false)
    private Family family;

    @ManyToOne(optional = false)
    private Element element;

    private Double score;

    public ElementEffectiveness(Family family, Element element, Double score) {
        this.family = family;
        this.element = element;
        this.score = Rating.valid(score) ? score : Rating.NEUTRAL.getScore();
    }
}
