package rextart.com.templateCore.interfaces;



import rextart.com.templateCore.exceptions.InvalidValueForTypeException;

/**
 * Created by Daniele Tavernelli on 3/14/2018.
 * This abstract class is used to build the type of a feature.
 * Relying of the type the software must be able to render the feature
 * and let the user select the respective value. It is a parametric class
 * Since the value can be of any type
 */

public interface FeatureType<Serializable> {

    /**
     * This method gets the value of the feature.
     * @return the object that represents the value
     */
    Serializable getValue();

    /**
     * This method sets the value of the feature.
     * @return if value is set correctly, false if the input was not valid
     */
    void setValue(Serializable serializable) throws InvalidValueForTypeException;

    /**
     * This method check if the value is valid
     * @return false iff validation procedure fails
     */
     boolean isValueValid() throws InvalidValueForTypeException;

}
