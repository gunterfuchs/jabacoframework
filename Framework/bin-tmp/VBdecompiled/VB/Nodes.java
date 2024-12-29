/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.Collection;
import VB.Node;
import VB.TreeRelationshipConstants;
import VB.TreeView;
import VBA.IResource;
import VBA.Interaction;
import VBA.VBVariant;

public class Nodes {
    private TreeView myTree;
    private Collection myHash;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Nodes(TreeView refTree) {
        Nodes Me;
        Throwable Err = null;
        Me.initVars();
        try {
            Me.myTree = refTree;
            return;
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Node Add(Node Relative, TreeRelationshipConstants Relationship, String Key, String Text) {
        Node Add = null;
        Throwable Err = null;
        try {
            Nodes Me;
            return Me.Add(Relative, Relationship, Key, Text, null);
        }
        catch (Throwable throwable) {
            Object var7_7 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Add;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Node Add(Node Relative, TreeRelationshipConstants Relationship, String Key2, String Text, IResource Image2) {
        Nodes Me;
        Node Add = null;
        Throwable Err = null;
        Node myNode = new Node(Me.myTree, Text);
        try {
            myNode.$Text(Text);
            Me.myHash.Add(VBVariant.valueOf(myNode), Key2);
            myNode.$Key(Key2);
            myNode.$Icon(Image2);
            myNode.$ForeColor(Me.myTree.$ForeColor());
            myNode.$BackColor(Me.myTree.$BackColor());
            myNode.$ForeColorSel(Me.myTree.$ForeColorSel());
            myNode.$BackColorSel(Me.myTree.$BackColorSel());
            myNode.$FontName(Me.myTree.$FontName());
            myNode.$FontBold(Me.myTree.$FontBold());
            myNode.$FontItalic(Me.myTree.$FontItalic());
            myNode.$FontSize(Me.myTree.$FontSize());
            if (!(Relative == null)) {
                Me.myTree.$Model().insertNodeInto(myNode, Relative, Relative.$ChildCount());
            } else {
                Me.myTree.$Model().insertNodeInto(myNode, Me.myTree.$Root(), Me.myTree.$Root().$ChildCount());
            }
            Me.myTree.$Root().$Expand(true);
            return myNode;
        }
        catch (Throwable throwable) {
            Object var8_9 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Add;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Clear() {
        Throwable Err = null;
        try {
            Nodes Me;
            Me.myHash.Clear();
            Me.myTree.$Root().removeAllChildren();
            return;
        }
        catch (Throwable throwable) {
            Object var2_2 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int $Count() {
        int $Count = 0;
        Throwable Err = null;
        try {
            Nodes Me;
            return Me.myHash.Count();
        }
        catch (Throwable throwable) {
            Object var3_3 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Count;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Node $Item(int Index) {
        Node $Item = null;
        Throwable Err = null;
        try {
            Nodes Me;
            return (Node)Me.myHash.Item(Index).toObject();
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Item;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Node $Item(String Key2) {
        Node $Item = null;
        Throwable Err = null;
        try {
            Nodes Me;
            return (Node)Me.myHash.Item(Key2).toObject();
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return $Item;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean Remove(int Index) {
        boolean Remove = false;
        Throwable Err = null;
        Node tmpNode = null;
        try {
            Nodes Me;
            tmpNode = (Node)Me.myHash.Item(Index).toObject();
            if (!Me.Remove(tmpNode)) {
                return Remove;
            }
            Me.myHash.Remove(Index);
            return Remove;
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Remove;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean Remove(String Key2) {
        boolean Remove = false;
        Throwable Err = null;
        Node tmpNode = null;
        try {
            Nodes Me;
            tmpNode = (Node)Me.myHash.Item(Key2).toObject();
            if (!Me.Remove(tmpNode)) {
                return Remove;
            }
            Me.myHash.Remove(Key2);
            return Remove;
        }
        catch (Throwable throwable) {
            Object var4_5 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Remove;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean Remove(Node Node2) {
        boolean Remove = false;
        Throwable Err = null;
        try {
            Nodes Me;
            Me.myTree.$Model().removeNodeFromParent(Node2);
            return true;
        }
        catch (Throwable throwable) {
            Object var4_4 = null;
            Err = throwable;
        }
        Interaction.MsgBox(Err);
        return Remove;
    }

    private void initVars() {
        Me.myTree = null;
        Me.myHash = new Collection();
    }
}
