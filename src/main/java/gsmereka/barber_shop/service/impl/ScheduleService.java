package gsmereka.barber_shop.service.impl;

import gsmereka.barber_shop.entity.ScheduleEntity;
import gsmereka.barber_shop.repository.IScheduleRepository;
import gsmereka.barber_shop.service.IScheduleService;
import gsmereka.barber_shop.service.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}