package rextart.com.tree;


import java.util.List;

/**
 * 
 * @author Daniele Tavernelli
 *This class represents the entire template structure.
 */
public class Template {
	
	/**
	 * the root of the template. From here every node is a descendant
	 */
	private Node root;
	
	/**
	 * the name of the template
	 */
	private String name;
	
	
	/**
	 * public methods
	 */
	
	/**
	 * add node to template
	 * @param parent node
	 * @param child node
	 */
	public void addNode(Node parent, Node child) {
		
		parent.addChild(child);
		
		child.setParent(parent);
		
	}
	
	/**
	 * add children to a node
	 * @param parent
	 * @param children
	 */
	public void addChildren(Node parent, List<Node> children) {
		
		parent.addChildrenList(children);
		
		for (Node child:children) {
			child.setParent(parent);
		}
		
	}
	
	/**
	 * remove target child of target parent
	 * @param parent
	 * @param child
	 */
	public void removeChild(Node parent, Node child) {
		
		parent.removeChild(child);
		
	}
	
	/**
	 * remove all children of target parent
	 * @param parent
	 */
	public void removeChildren(Node parent) {
		parent.removeChildren();
	}
	
	
	/**
	 * getters e setters
	 */

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
}
