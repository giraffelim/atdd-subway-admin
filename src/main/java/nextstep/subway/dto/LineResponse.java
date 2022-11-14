package nextstep.subway.dto;

import java.util.List;
import java.util.stream.Collectors;
import nextstep.subway.domain.Line;

public class LineResponse {
    private final Long id;
    private final String name;
    private final String color;
    private final List<StationResponse> stations;

    public static LineResponse from(Line line) {
        List<StationResponse> stations = line.findAssignedStations().stream()
                .map(StationResponse::from)
                .collect(Collectors.toList());
        return new LineResponse(line.getId(), line.getName(), line.getColor(), stations);
    }

    private LineResponse(Long id, String name, String color, List<StationResponse> stations) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.stations = stations;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public List<StationResponse> getStations() {
        return stations;
    }
}
