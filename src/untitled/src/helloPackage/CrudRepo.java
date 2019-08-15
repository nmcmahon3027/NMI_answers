package helloPackage;

import java.io.Serializable;

public interface CrudRepo <T, ID extends Serializable> {

	<S extends T> S save(S entity);



}
