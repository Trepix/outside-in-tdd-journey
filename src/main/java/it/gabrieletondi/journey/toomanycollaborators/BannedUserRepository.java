package it.gabrieletondi.journey.toomanycollaborators;

import java.util.List;

public interface BannedUserRepository {
    List<String> listBannedUsers();
}
