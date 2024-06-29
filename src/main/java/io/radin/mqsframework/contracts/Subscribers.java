package io.radin.mqsframework.contracts;

import java.util.List;

public interface Subscribers<T> {
    List<T> getMembers();
}
