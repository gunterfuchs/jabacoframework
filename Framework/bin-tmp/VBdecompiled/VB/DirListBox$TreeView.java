/*
 * Decompiled with CFR 0.152.
 */
package VB;

import VB.DirListBox;
import VB.Node;
import VB.TreeView;

public class DirListBox$TreeView
extends TreeView {
    int ID;
    DirListBox Owner;
    int Index;

    public DirListBox$TreeView() {
        DirListBox$TreeView Me;
    }

    public void setOwner(DirListBox dirListBox, int n) {
        Me.Owner = dirListBox;
        Me.ID = n;
        Me.Index = -1;
    }

    @Override
    public void _Click() {
        DirListBox$TreeView Me;
        if (1 == Me.ID) {
            Me.Owner.myTree_Click();
            return;
        }
    }

    @Override
    public void _NodeClick(Node h2) {
        DirListBox$TreeView Me;
        if (1 == Me.ID) {
            Me.Owner.myTree_NodeClick(h2);
            return;
        }
    }
}
