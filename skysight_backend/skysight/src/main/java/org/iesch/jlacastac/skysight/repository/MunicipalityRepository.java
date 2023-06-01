package org.iesch.jlacastac.skysight.repository;

import org.iesch.jlacastac.skysight.model.municipality.Municipality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipalityRepository extends JpaRepository<Municipality, Long> {
}
