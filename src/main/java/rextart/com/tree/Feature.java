package rextart.com.tree;


import java.io.Serializable;

import rextart.com.templateCore.interfaces.FeatureType;

/**
 * Created by Daniele Tavernelli on 3/14/2018.
 * this class represent the atomic element of a node.
 * Nodes can have multiple features that generally users are
 * asked to edit
 */

public class Feature {

    /**
     * The node that holds @this
     */
    private Node parentNode;

    /**
     * Name of @this
     */
    private String name;

    /**
     * Info related to @this
     */
    private String info;

    /**
     * The type of @this. From the type
     * the system gets the layout that is able to edit and
     * render the @value
     */
    private FeatureType<Serializable> featureType;


    /**
     * public methods
     */
    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    public FeatureType<Serializable> getFeatureType() {
        return featureType;
    }

    public void setFeatureType(FeatureType<Serializable> featureType) {
        this.featureType = featureType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
