package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Bucket;

public interface BucketRepository extends JpaRepository<Bucket, Integer> {

}
