package com.cjpowered.learn.inventory.support;

import java.util.List;

/**
 * Item stock database interface. The order department provides this and
 * maintains its implementations. They are able to handle storing and retrieving
 * any simple {@link Item} instance data although they might push back on
 * instance data that breaks their own model.
 *
 * Item instances retrieved from and passed into this interface are compared for
 * equality based on their Java identity as implemented by
 * {@link Object#equals(Object)}.
 *
 * To be compliant with these contracts, all implementations of {@link Item}
 * must be immutable.
 *
 */
public interface InventoryDatabase {

    /**
     * Fetch number on-hand.
     *
     * @param item
     *            item to query. The item instance must have been returned by
     *            the same implementation on which this method is called.
     *
     * @return fetched value
     */
    int onHand(Item item);

    /**
     * Fetch list of all stocked items. Each {@link Item} retrieved will contain
     * all the instance data defined by its implementation.
     *
     * @return fetched value
     */
    List<Item> stockItems();

}
