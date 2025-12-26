package com.example.demo.util;

import com.example.demo.model.ApprovalAction;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.List;

@Component
public class HibernateQueryUtil {

    @PersistenceContext
    private EntityManager em;

    public List<ApprovalAction> findActionsByApproverUsingCriteria(Long approverId) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<ApprovalAction> cq = cb.createQuery(ApprovalAction.class);
        Root<ApprovalAction> root = cq.from(ApprovalAction.class);

        cq.select(root)
          .where(cb.equal(root.get("approverId"), approverId));

        return em.createQuery(cq).getResultList();
    }
}
