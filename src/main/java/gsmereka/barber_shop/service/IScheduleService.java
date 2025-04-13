package gsmereka.barber_shop.service;

import gsmereka.barber_shop.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}