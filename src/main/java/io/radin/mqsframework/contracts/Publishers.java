package io.radin.mqsframework.contracts;

import java.util.List;

public interface Publishers<T> {
    List<T> getMembers();

    void register();
}
