package rextart.com.tree;


import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniele Tavernelli on 3/14/2018.
 * This class represents the single node of the template.
 */

public class Node {
	
	
	/**
	 * name of @this to be displayed
	 */
	 String name;

    /**
     * List of feautures of @this. Those features
     * are the "editable" part of @this.
     */
     List<Feature> featureList;

    /**
     * Parent Node of @this.
     * Can be null only if @this is a root
     */
     WeakReference<Node> parentNode;

    /**
     * List of children of @this.
     */
     List<Node> chlidrenList;

    /**
     * constructor
     */
     Node() {

        featureList = new ArrayList<>();

        chlidrenList = new ArrayList<>();
        
        
    }


    /**
     *  methods
     */

    /**
     * Set parent node of @this
     * @param parentNode
     */
     void setParent(Node parentNode) {
        this.parentNode = new  WeakReference<Node>(parentNode);
    }

    /**
     * get parent of @this
     * @return parent
     */
	 Node getParentNode() {
		
		if (parentNode!=null) {
			return parentNode.get();
		}
		return null;
		
	}

    /**
     * add a feature to @this
     * @param feature
     */
     void addFeature(Feature feature) {
        this.featureList.add(feature);
    }


    /**
     * add a list of feature to @this
     * @param featureList
     */
     void addFeatureList(List<Feature> featureList) {
        this.featureList.addAll(featureList);
    }

    /**
     * add a child to @this
     * @param child
     */
     void addChild(Node child) {
        this.chlidrenList.add(child);
    }


    /**
     * add a list of feature to @this
     * @param childrenList
     */
     void addChildrenList(List<Node> childrenList) {
        this.chlidrenList.addAll(chlidrenList);
    }
    
   /**
    * remove a target child from the children list
    * @param child
    * @return false if child was not in the children list
    */
     boolean removeChild(Node child) {
    	
    	if (!chlidrenList.contains(child)) {
    		return false;
    	}
    	
    	chlidrenList.remove(child);
    	
    	return true;
    	
    }
    
    
    /**
     * remove children of a node
     */
     void removeChildren() {
    	
    	chlidrenList = new ArrayList<>();
    	
    }

	 List<Feature> getFeatureList() {
		return featureList;
	}


	 void setFeatureList(List<Feature> featureList) {
		this.featureList = featureList;
	}




	 List<Node> getChlidrenList() {
		return chlidrenList;
	}


	 void setChlidrenList(List<Node> chlidrenList) {
		this.chlidrenList = chlidrenList;
	}


	 String getName() {
		return name;
	}


	 void setName(String name) {
		this.name = name;
	}

    

}
