package com.xworkz.trainApp.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.Target;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.lang.annotation.Repeatable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TrainDto")
@NamedQueries({
        @NamedQuery(name ="readByTrainNoAndTrainName" ,query = "select dto from TrainDto dto where dto.trainNo = : no AND dto.trainName = : nm"),
        @NamedQuery(name = "readByStartAndDest",query = "select dto from TrainDto dto where dto.start = : start AND dto.dest = : dest"),
        @NamedQuery(name = "updateStartAndDestByTraiNo", query = "update TrainDto dto set dto.start = : start ,dto.dest=:dest where dto.trainNo = : no"),
        @NamedQuery(name = "updateTimeByTrainName",query = "update TrainDto dto set dto.time = : time where dto.trainName =:nm"),
        @NamedQuery(name = "deleteByTrainNo" , query = "delete from TrainDto dto where dto.trainNo = : no")
})
public class TrainDto {
    @Id
    private int trainId;
    @NonNull
    private String trainName;
    private int trainNo;
    @NotNull
    private String start;
    @NotNull
    private String dest;
    private String time;
    private int noOfCoaches;
}
