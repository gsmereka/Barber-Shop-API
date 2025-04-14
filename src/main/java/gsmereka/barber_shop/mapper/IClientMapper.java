package gsmereka.barber_shop.mapper;

import gsmereka.barber_shop.controller.request.SaveClientRequest;
import gsmereka.barber_shop.controller.request.UpdateClientRequest;
import gsmereka.barber_shop.controller.response.ClientDetailResponse;
import gsmereka.barber_shop.controller.response.ListClientResponse;
import gsmereka.barber_shop.controller.response.SaveClientResponse;
import gsmereka.barber_shop.controller.response.UpdateClientResponse;
import gsmereka.barber_shop.entity.ClientEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IClientMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final SaveClientRequest request);

    SaveClientResponse toSaveResponse(final ClientEntity entity);

    @Mapping(target = "schedules", ignore = true)
    ClientEntity toEntity(final long id, final UpdateClientRequest request);

    UpdateClientResponse toUpdateResponse(final ClientEntity entity);

    ClientDetailResponse toDetailResponse(final ClientEntity entity);

    List<ListClientResponse> toListResponse(final List<ClientEntity> entities);

}