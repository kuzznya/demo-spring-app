package com.github.kuzznya.demo.service;

import com.github.kuzznya.demo.entity.GroupEntity;
import com.github.kuzznya.demo.model.Group;
import com.github.kuzznya.demo.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupMapper mapper;
    private final GroupRepository repository;

    public List<String> getGroups() {
        return repository.findAll().stream()
                .map(GroupEntity::getName)
                .collect(Collectors.toList());
    }

    @Transactional
    public Optional<Group> findGroup(String name) {
        return repository.findByName(name).map(mapper::entityToModel);
    }

    public Group createGroup(Group group) {
        GroupEntity entity = new GroupEntity(null, group.name(), null);
        return mapper.entityToModel(repository.save(entity));
    }

    @Transactional
    public void deleteGroup(String name) {
        repository.deleteByName(name);
    }
}
